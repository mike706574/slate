(ns {{full-name}}.main
  (:require [com.stuartsierra.component :as component]
            [{{full-name}}.system :as system])
  (:gen-class :main true))

(defn -main
  [& args]
  (component/start-system (system/system {})))
