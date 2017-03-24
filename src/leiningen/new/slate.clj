(ns leiningen.new.slate
  (:require [clojure.string :as str])
  (:use [leiningen.new.templates :only [renderer name-to-path ->files
                                        sanitize-ns project-name year]]))

(def render (renderer "slate/templates"))

(defn slate
  [name]
  (let [[groupId artifactId] (str/split name #"/" 2)
        artifactId (or artifactId groupId)]
    (println "Generating a project in directory" artifactId)
    (let [data {:full-name name
                :groupId groupId
                :artifactId artifactId
                :name artifactId  ; used by ->files
                :year (year)
                :path (name-to-path name)}]
      (->files data
               [".gitignore" (render ".gitignore")]
               ["README.md" (render "README.md" data)]
               ["epl-v10.html" (render "epl-v10.html" data)]
               ["project.clj" (render "project.clj" data)]
               ["src/{{path}}/main.clj" (render "main.clj" data)]
               ["src/{{path}}/system.clj" (render "system.clj" data)]
               ["dev/user.clj" (render "user.clj" data)]))))
