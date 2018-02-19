(ns app.core
  (:gen-class))

(defn foo [x]
  (println x "Hello, World!"))

(defn fibonacci [x] 
  (if (<= x 2) 1
      (+ (fibonacci (- x 2)) (fibonacci (- x 1)))))

(defn factorial [x]
  (if (<= x 1) 1
      (* (factorial (dec x)) x)))

(defn -main [& args]
  (let [arg-1 (or (first args) "0")
        n (Integer/parseInt arg-1)]
    (println "fib(" n ") =" (fibonacci n))
    (println "!(" n ") =" (factorial n))))
