package testsharedlib

class JenkinsfileTestUtil {    
    def jenks

    public JenkinsfileTestUtil(script){
        jenks = script
    }

    public preparation() {        
        println "Iniciando preparación de la ejecución." 
    }

 
}