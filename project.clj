(defproject duct/compiler.cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [integrant "0.3.3"]]
  :profiles
  {:provided {:dependencies [[org.clojure/clojurescript "1.9.494"]]}
   :dev      {:source-paths ["dev/src"]}})
