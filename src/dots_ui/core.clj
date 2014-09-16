(ns dots-ui.core
  (:gen-class)
  (:import [javax.swing JFrame JLabel]))
;;(defn -main
;;  "I don't do a whole lot ... yet."
;;  [& args]
;;  (println "Hello, World!"))

(defn initialize-gui
  []
  (let [frame (JFrame. "Random/Multithreaded Dots")
        label (JLabel. "mine form")]

    (doto frame
      (.add label)
      (.setDefaultCloseOperation JFrame/DISPOSE_ON_CLOSE)
;;      (-> .getContentPane
;;         (.setDefaultCloseOperationd JFrame/DISPOSE_ON_CLOSE)
;;          (.pack)
            (.setSize 200 200) 
            (.setVisible true))
      ))

(defn -main
 [& args]
; (do-swing* :now initialize-gui))  
  (initialize-gui))
                            
                          
