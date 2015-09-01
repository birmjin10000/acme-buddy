(defproject acme-auth "0.1.0-SNAPSHOT"
  :description "Acme Corp Authentication Service"
  :url "https://github.com/rundis/acme-buddy/acme-auth"
  :min-lein-version "2.0.0"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/java.jdbc "0.4.1"]
                 [com.h2database/h2 "1.4.188"]
                 [hikari-cp "1.3.0"]
                 [compojure "1.4.0"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [ring/ring-json "0.4.0"]
                 [ch.qos.logback/logback-classic "1.1.3"]
                 [buddy/buddy-sign "0.6.1"]
                 [buddy/buddy-hashers "0.6.0"]]
  :ring {:handler acme-auth.core/app
         :port 6001
         :init acme-auth.core/bootstrap}
  :profiles {:dev {:plugins [[lein-ring "0.9.6"]]
                   :test-paths ^:replace []}
             :test {:dependencies [[midje "1.7.0"]]
                    :plugins [[lein-midje "3.1.3"]]
                    :test-paths ["test"]
                    :resource-paths ["test/resources"]}})
