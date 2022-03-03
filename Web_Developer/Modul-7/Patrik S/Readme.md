Entdeckte Fehlern / Merkunken

index.html 
Zeile 15 Script Elemente sollen meinst im Head Element verlinkt werden
Zeile 22, du übergibst zweimal das Attribut class.
Zeile 47 das Schließ Tag von div Container hat kein offen Tag paar.
Ich würde nicht das render('trash', 0) Funktion über Zwei Containers ausführen, sondern nur über eine übergeornete Container.

script.js
1. Funktionen sind zu groß, schwer zu lesen, zu verstehen und nicht kommentiert. Spezifisch render Funktion
 - Wenn Funktionen zu lang werden, man soll schauen es zu verteilen unter mehrere Funktionen.
 - Eine Funktion soll nicht sehr viele Sachen ausführen und nur was die Namen entspricht.

2. Arrays Variablen sollte man von Konvention her als Plural benennen.

2. Funktion editCard fehlt das Schließklammer oder zu spät geschlossen.
3. Funktion editCard verwechselst du deine globalen Variablen Name mit der Name von lokalen Variablen. 
4. Funktion editCard du definierst editTitle und editNote, aber du nutzt sie gar nicht.
5. Funktion editCard du sprichst an Variablen an, die gar nicht definiert sind, wie createNewTitle.
6. Funktion editCard du sprichst an das Element mit ID allBlurBox, aber das ist nicht mehr definiert. Wahrscheinlich du hast der Container wo dieses Element sich befindet entleert. Erst wird allBlurBox Element erstellt, wenn man einmal auf TrashBox anklickt. Dann funktioniert Funkion editCard fehlerfrei.