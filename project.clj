(defproject edu-site "0.1.0-SNAPSHOT"
  :description "Edu-Site app"
  :url "http://github.com/jikanter/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/java.jdbc "0.3.2"]
                 [mysql/mysql-connector-java "5.1.6"]
                 [ring/ring-jetty-adapter "1.2.1"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.4"]]
  :main ^:skip-aot edu-site.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
