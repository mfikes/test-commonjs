(ns foo.bar
  (:require [greeting :refer [hello]]))

(enable-console-print!)

(println (hello "Welt!"))
