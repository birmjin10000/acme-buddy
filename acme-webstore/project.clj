(defproject acme-webstore "0.1.0-SNAPSHOT"
  :description "Acme Corp Web Store"
  :url "https://github.com/rundis/acme-buddy/acme-webstore"
  :min-lein-version "2.0.0"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [compojure "1.4.0"]
                 [ring "1.4.0"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-headers "0.1.3"]
                 [hiccup "1.0.5"]
                 [clj-http "2.0.0"]
                 [ch.qos.logback/logback-classic "1.1.3"]
                 [buddy/buddy-sign "0.6.1"]]
  :ring {:handler acme-webstore.web/app
         :port 6002}
  :profiles {:dev {:plugins [[lein-ring "0.9.6"]]
                   :test-paths ^:replace []}
             :test {:dependencies [[midje "1.7.0"]]
                    :plugins [[lein-midje "3.1.3"]]
                    :test-paths ["test"]
                    :resource-paths ["test/resources"]}})
