(ns lets-party.handler.example
  (:require [ataraxy.core :as ataraxy]
            [ataraxy.response :as response] 
            [clojure.java.io :as io]
            [integrant.core :as ig]))

(defmethod ig/init-key :lets-party.handler/example [_ options]
  (fn [{[_] :ataraxy/result}]
    [::response/ok (io/resource "lets_party/handler/example/example.html")]))
