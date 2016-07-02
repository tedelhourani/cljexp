(set-env!
 :source-paths #{"src"}
 :dependencies '[[org.clojure/clojure "1.7.0"],
                 [org.clojure/math.numeric-tower "0.0.4"]])

(require '[cljexp.core :as app])

(deftask run []
  (app/-main))