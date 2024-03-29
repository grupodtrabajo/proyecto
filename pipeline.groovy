pipeline {
    agent any
    
    stages {
        stage('Clonar Repositorio') {
            steps {
                git branch: 'main', credentialsId: 'ID_DE_TUS_CREDENCIALES', url: 'https://github.com/grupodtrabajo/proyecto.git'
            }
        }
        stage('Verificar Conexión') {
            steps {
                sh 'echo "La conexión con Git funciona correctamente"'
            }
        }
        stage('Tareas adicionales') {
            steps {
                // Aquí puedes agregar cualquier tarea adicional que necesites ejecutar
            }
        }
    }
}
