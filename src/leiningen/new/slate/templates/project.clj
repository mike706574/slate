(defproject {{full-name}} "0.1.0-SNAPSHOT"
  :description "TODO"
  :url "TODO"

  :license {:name "TODO: Choose a license"
            :url "http://choosealicense.com/"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [com.taoensso/timbre "4.8.0"]
                 [com.stuartsierra/component "0.3.1"]]
  :profiles {:uberjar {:aot :all
                       :main {{full-name}}.main}
             :dev {:target-path "target/dev"
                   :dependencies [[org.clojure/tools.namespace "0.2.11"]]
                   :source-paths ["dev"]}}
  :repl-options {:init-ns user})
