(ns app.nav.subs
  (:require [re-frame.core :refer [reg-sub]]))

(reg-sub
 :active-nav
 (fn [db _]
   (get-in db [:nav :active-nav])))

(reg-sub
 :active-user-profile
 (fn [db _]
   (let [uid (get-in db [:auth :uid])]
     (get-in db [:users uid :profile]))))