(defproject {{full-name}} "0.1.0-SNAPSHOT"
  :description "TODO"
  :url "TODO"
  :license {:name "TODO: Choose a license"
            :url "http://choosealicense.com/"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha15"]
                 [com.taoensso/timbre "4.8.0"]
                 [com.stuartsierra/component "0.3.2"]]
  :profiles {:uberjar {:aot :all
                       :main {{full-name}}.main}
             :dev {:source-paths ["dev"]
                   :target-path "target/dev"
                   :dependencies [[org.clojure/tools.namespace "0.2.11"]
                                  [org.clojure/test.check "0.9.0"]]}}
  :repl-options {:init-ns user})
