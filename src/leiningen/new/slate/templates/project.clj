(defproject {{full-name}} "0.1.0-SNAPSHOT"
  :description "TODO"
  :url "TODO"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.9.0-alpha16"]
                 [com.taoensso/timbre "4.10.0"]
                 [com.stuartsierra/component "0.3.2"]]
  :profiles {:uberjar {:aot :all
                       :main {{full-name}}.main}
             :dev {:source-paths ["dev"]
                   :target-path "target/dev"
                   :dependencies [[org.clojure/tools.namespace "0.2.11"]
                                  [org.clojure/test.check "0.9.0"]]}}
  :repl-options {:init-ns user})
