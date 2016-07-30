(ns expect-call.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [org.senatehouse.expect-call-test]))

(doo-tests 'org.senatehouse.expect-call-test)
