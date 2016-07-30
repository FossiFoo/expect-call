(defproject org.senatehouse/expect-call "0.1.0"
  :description "A Clojure library for no-fuss function mocking"
  :url "https://github.com/meredydd/expect-call"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.5.3"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.8.34"]
                 [org.clojure/core.match "0.3.0-alpha4"]]

  :plugins [[lein-cljsbuild "1.1.3"]
            [lein-doo "0.1.6"]]

  :source-paths ["src/clj"]

  :doo {:build "test"
        :alias {:default :node}}

  :cljsbuild {:builds [{:id "test"
                        :source-paths ["src/cljs" "test/cljs"]
                        :compiler {:output-to "resources/public/js/testable.js"
                                   :main expect-call.runner
                                   :optimizations :none
                                   :target :nodejs}}]})
