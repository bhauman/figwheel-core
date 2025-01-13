(defproject com.bhauman/figwheel-core "0.2.20"
  :description "Figwheel core provides code reloading facilities for ClojureScript."
  :url "https://github.com/bhauman/figwheel-core"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/bhauman/figwheel-core"}

  :dependencies
  [[org.clojure/clojure "1.10.0"]
   [org.clojure/clojurescript "1.10.773" :exclusions [commons-codec]]
   [org.clojure/data.json "2.4.0"]
   ])
