(ns test.subset
  (:require 	[clojure.core.typed :as t]
                [clojure.set :as set]
                [test.core]
		[clojure.test :refer :all]
		[clojure.core.typed.test.test-utils :refer [is-tc-e]]))




(deftest subset-test 
	(:require [test.core])
	(is-tc-e(clojure.set/subset? #{1} #{2}) Boolean))
