(ns edu-site.core 
  (require [compojure.core :refer [defroutes GET]]
           [ring.adapter.jetty :as ring]
           [clojure.java.jdbc :as sql])
  (:gen-class))

(defroutes routes
  (GET "/" [] "<div>[Console]</div>"))

(defn -main []
  (ring/run-jetty #'routes {:port 8081 :join? false}))

