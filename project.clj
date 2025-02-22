(defproject com.ashafa/clutch "0.5.0"
  :description "A Clojure library for Apache CouchDB."
  :url "https://github.com/clojure-clutch/clutch/"
  :license {:name "BSD"
            :url "http://www.opensource.org/licenses/BSD-3-Clause"}
  :dependencies [[org.clojure/clojure "1.11.1"]

                 [clj-http "3.12.3"]
                 [cheshire "5.11.0"]
                 [commons-codec "1.15"]
                 [com.cemerick/url "0.1.1"]

                 [org.clojure/clojurescript "1.11.60" :optional true
                  :exclusions [com.google.code.findbugs/jsr305
                               com.googlecode.jarjar/jarjar
                               junit
                               org.apache.ant/ant
                               org.json/json
                               org.mozilla/rhino]]]
  :profiles {:dev {}
             :1.2.0 {:dependencies [[org.clojure/clojure "1.2.0"]]}
             :1.3.0 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.5.0 {:dependencies [[org.clojure/clojure "1.5.0-alpha6"]]}}
  :aliases  {"all" ["with-profile" "dev,1.2.0:dev,1.3.0:dev:dev,1.5.0"]}
  :min-lein-version "2.0.0"
  :test-selectors {:default #(not= 'test-docid-encoding (:name %))
                   :all (constantly true)})
