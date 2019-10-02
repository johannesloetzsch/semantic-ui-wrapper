(ns fulcrologic.semantic-ui.workspaces-main
  (:require [nubank.workspaces.core :as ws]
            [fulcrologic.semantic-ui.workspaces.button]
            [fulcrologic.semantic-ui.workspaces.dropdown]
            [fulcrologic.semantic-ui.workspaces.form]
            [fulcrologic.semantic-ui.workspaces.icon]
            [fulcrologic.semantic-ui.workspaces.input]
            [fulcrologic.semantic-ui.workspaces.x]))

(defonce init (ws/mount))

