(ns test.core

(:require [clojure.core.typed :as t]))


(t/ann ^:no-check clojure.set/subset?[(t/Set t/Any) (t/Set t/Any)  -> Boolean])

(t/ann ^:no-check clojure.set/superset? [(t/Set t/Any) (t/Set t/Any)  -> Boolean])

(t/ann ^:no-check clojure.set/join [(t/Set t/Any) (t/Set t/Any)  -> (t/Set t/Any)])

(t/ann ^:no-check clojure.set/index [(t/Set t/Any) (t/Vec t/Any)  -> (t/Map t/Any t/Any )])

(t/ann ^:no-check clojure.set/map-invert [(t/Map t/Any t/Any )  -> (t/Map t/Any t/Any)])

(t/ann ^:no-check clojure.set/project [(t/Set t/Any) (t/Vec t/Any) -> (t/Set t/Any)])

(t/ann ^:no-check clojure.set/rename [(t/Set t/Any) (t/Map t/Any t/Any) -> (t/Set t/Any)])

(t/ann ^:no-check clojure.set/rename-keys [(t/Map t/Any t/Any) (t/Map t/Any t/Any) -> (t/Map t/Any t/Any)])

(t/ann ^:no-check clojure.set/select [ (t/IFn [t/AnyInteger -> java.lang.Boolean]) (t/Set t/Any) -> (t/Set t/Any)])

