(ns brantbrink.core (:gen-class))
(defn -main "I don't do a whole lot... yet." [& args] (println "Hello, World!"))

(defn get-distance [edge]
  (nth edge 2))

(defn find-edges [edges a b]
  (filter (fn [elem]
            (or (and (= (first elem) a)
                     (= (second elem) b))
                (and (= (second elem) a)
                     (= (first elem) b))))
          edges))

(defn find-edge [edges a b]
  (first (find-edges edges a b)))

(defn distance [edges a b]
  (get-distance (find-edge edges a b)))
