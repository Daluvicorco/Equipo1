# Equipo1
Proyecto de IS2 del equipo 1

Crear tabla actividad

CREATE TABLE `cliente` (
  `dni` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `metrosTienda` float NOT NULL,
  `sancion` tinyint DEFAULT NULL,
  `mensajeSancion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `actividad` (
  `id` int NOT NULL,
  `tipo` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `horaInicio` time NOT NULL,
  `horaFin` time NOT NULL,
  `ganador` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ganadorActividad_FK_idx` (`ganador`),
  CONSTRAINT `ganadorActividad_FK` FOREIGN KEY (`ganador`) REFERENCES `cliente` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `participa_en` (
  `cliente` varchar(100) NOT NULL,
  `actividad` int NOT NULL,
  PRIMARY KEY (`cliente`,`actividad`),
  KEY `actividad_FK_idx` (`actividad`),
  CONSTRAINT `actividad_FK` FOREIGN KEY (`actividad`) REFERENCES `actividad` (`id`),
  CONSTRAINT `cliente_FK` FOREIGN KEY (`cliente`) REFERENCES `cliente` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*
Victor Serrano Hernández: Creada funcion de introducir actividad a la base de datos

Trabajo practica 6:
Calcular_Precio => Enrique Pallás
Controlador_Camping => Victor Serrano, Alejandro Granell
Camping => Aleix Maroto
Reserva => Enrique Pallás
Historico => 


*/
