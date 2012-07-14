(ns brantbrink.core-test
  (:use clojure.test
        brantbrink.core))

(deftest test1
  (def edges '((:nio :tio 1750) (:nio :elva 180) (:tio :elva 1020)))
  (testing "single edges"
    (is (= (distance edges :tio :elva) 1020))
    (is (= (distance edges :nio :elva) 180))
    (is (= (distance edges :nio :tio) 1750)))
  (testing "distances should be symmetric"
    (is (= (distance edges :elva :tio) 1020))))
