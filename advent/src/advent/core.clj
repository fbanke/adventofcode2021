(ns advent.core)

(defn depthIncrease [measurements]
  (case (count measurements)
    0 0
    1 0
    (let [[first, second] measurements]
     (if (> second first)
       (+ 1 (depthIncrease (subvec measurements 1)))
       (depthIncrease (subvec measurements 1))
     )
    )
))

