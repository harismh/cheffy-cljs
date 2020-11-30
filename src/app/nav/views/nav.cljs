(ns app.nav.views.nav
  (:require [app.nav.views.authenticated :refer [authenticated]]
            [app.nav.views.public :refer [public]]
            [re-frame.core :as rf]))

(defn nav
  []
  (let [logged-in? @(rf/subscribe [:logged-in?])]
    (if logged-in?
      [authenticated]
      [public])))
