(ns test.subset
  (:require 	[clojure.core.typed :as t]
                [clojure.set :as set]
                [test.core]
		[clojure.test :refer :all]
		[clojure.core.typed.test.test-utils :refer [is-tc-e]]))




(deftest subset-test 
	(is-tc-e(clojure.set/subset? #{1} #{2}) Boolean (:require [clojure.set]
	                                                          [test.core])))
