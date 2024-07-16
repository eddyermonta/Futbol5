-- MySQL Workbench Forward Engineering

SET
@OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET
@OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET
@OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema futbol5
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `futbol5`;

-- -----------------------------------------------------
-- Schema futbol5
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `futbol5` DEFAULT CHARACTER SET utf8;
USE
`futbol5` ;

-- -----------------------------------------------------
-- Table `futbol5`.`Notificacion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `futbol5`.`Notificacion`;

CREATE TABLE IF NOT EXISTS `futbol5`.`Notificacion`
(
    `idNotificacion`
    INT
    NOT
    NULL,
    `contenido`
    VARCHAR
(
    5000
) NULL,
    `origen` VARCHAR
(
    45
) NULL,
    `destino` VARCHAR
(
    45
) NULL,
    `asunto` VARCHAR
(
    45
) NULL,
    `fecha` DATE NULL,
    PRIMARY KEY
(
    `idNotificacion`
))
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `futbol5`.`Persona`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `futbol5`.`Persona`;

CREATE TABLE IF NOT EXISTS `futbol5`.`Persona`
(
    `idPersona`
    INT
    NOT
    NULL,
    `nombre`
    VARCHAR
(
    45
) NULL,
    `tipoDocumento` VARCHAR
(
    45
) NULL,
    `documento` VARCHAR
(
    45
) NULL,
    `correoElectronico` VARCHAR
(
    45
) NULL,
    `Notificacion_idNotificacion` INT NOT NULL,
    PRIMARY KEY
(
    `idPersona`
),
    INDEX `fk_Persona_Notificacion1_idx`
(
    `Notificacion_idNotificacion`
    ASC
) VISIBLE,
    CONSTRAINT `fk_Persona_Notificacion1`
    FOREIGN KEY
(
    `Notificacion_idNotificacion`
)
    REFERENCES `futbol5`.`Notificacion`
(
    `idNotificacion`
)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `futbol5`.`Partido`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `futbol5`.`Partido`;

CREATE TABLE IF NOT EXISTS `futbol5`.`Partido`
(
    `idPartido`
    INT
    NOT
    NULL,
    `estado`
    VARCHAR
(
    45
) NULL,
    `resultado` VARCHAR
(
    45
) NULL,
    `fechaPatido` DATETIME NULL,
    `semana` INT NULL,
    `Notificacion_idNotificacion` INT NOT NULL,
    PRIMARY KEY
(
    `idPartido`
),
    INDEX `fk_Partido_Notificacion1_idx`
(
    `Notificacion_idNotificacion`
    ASC
) VISIBLE,
    CONSTRAINT `fk_Partido_Notificacion1`
    FOREIGN KEY
(
    `Notificacion_idNotificacion`
)
    REFERENCES `futbol5`.`Notificacion`
(
    `idNotificacion`
)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `futbol5`.`Infraccion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `futbol5`.`Infraccion`;

CREATE TABLE IF NOT EXISTS `futbol5`.`Infraccion`
(
    `idInfraccion`
    INT
    NOT
    NULL,
    `cantidadInfraccion`
    INT
    NULL,
    `penalizado`
    TINYINT
    NULL,
    `Partido_idPartido`
    INT
    NOT
    NULL,
    PRIMARY
    KEY
(
    `idInfraccion`
),
    INDEX `fk_Infraccion_Partido1_idx`
(
    `Partido_idPartido`
    ASC
) VISIBLE,
    CONSTRAINT `fk_Infraccion_Partido1`
    FOREIGN KEY
(
    `Partido_idPartido`
)
    REFERENCES `futbol5`.`Partido`
(
    `idPartido`
)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `futbol5`.`Jugador`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `futbol5`.`Jugador`;

CREATE TABLE IF NOT EXISTS `futbol5`.`Jugador`
(
    `idJugador`
    INT
    NOT
    NULL,
    `tipoJugador`
    VARCHAR
(
    45
) NULL,
    `promedio` DECIMAL
(
    2,
    2
) NULL,
    `Persona_idPersona` INT NOT NULL,
    `Infraccion_idInfraccion` INT NOT NULL,
    `suscripcion` VARCHAR
(
    45
) NULL,
    `formaJuego` VARCHAR
(
    45
) NULL,
    PRIMARY KEY
(
    `idJugador`
),
    INDEX `fk_Jugador_Persona1_idx`
(
    `Persona_idPersona`
    ASC
) VISIBLE,
    INDEX `fk_Jugador_Infraccion1_idx`
(
    `Infraccion_idInfraccion`
    ASC
) VISIBLE,
    CONSTRAINT `fk_Jugador_Persona1`
    FOREIGN KEY
(
    `Persona_idPersona`
)
    REFERENCES `futbol5`.`Persona`
(
    `idPersona`
)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `fk_Jugador_Infraccion1`
    FOREIGN KEY
(
    `Infraccion_idInfraccion`
)
    REFERENCES `futbol5`.`Infraccion`
(
    `idInfraccion`
)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `futbol5`.`Calificacion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `futbol5`.`Calificacion`;

CREATE TABLE IF NOT EXISTS `futbol5`.`Calificacion`
(
    `idCalificacion`
    INT
    NOT
    NULL
    AUTO_INCREMENT,
    `nota`
    DOUBLE
(
    2,
    2
) NULL,
    `critica` VARCHAR
(
    1000
) NULL,
    `Jugador_idJugador` INT NOT NULL,
    `Partido_idPartido` INT NOT NULL,
    PRIMARY KEY
(
    `idCalificacion`
),
    INDEX `fk_Calificacion_Jugador1_idx`
(
    `Jugador_idJugador`
    ASC
) VISIBLE,
    INDEX `fk_Calificacion_Partido1_idx`
(
    `Partido_idPartido`
    ASC
) VISIBLE,
    CONSTRAINT `fk_Calificacion_Jugador1`
    FOREIGN KEY
(
    `Jugador_idJugador`
)
    REFERENCES `futbol5`.`Jugador`
(
    `idJugador`
)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `fk_Calificacion_Partido1`
    FOREIGN KEY
(
    `Partido_idPartido`
)
    REFERENCES `futbol5`.`Partido`
(
    `idPartido`
)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `futbol5`.`Equipo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `futbol5`.`Equipo`;

CREATE TABLE IF NOT EXISTS `futbol5`.`Equipo`
(
    `idEquipo`
    INT
    NOT
    NULL,
    `Jugador_idJugador`
    INT
    NOT
    NULL,
    `Partido_idPartido`
    INT
    NOT
    NULL,
    `nombre`
    VARCHAR
(
    45
) NULL,
    PRIMARY KEY
(
    `idEquipo`
),
    INDEX `fk_Equipo_Jugador1_idx`
(
    `Jugador_idJugador`
    ASC
) VISIBLE,
    INDEX `fk_Equipo_Partido1_idx`
(
    `Partido_idPartido`
    ASC
) VISIBLE,
    CONSTRAINT `fk_Equipo_Jugador1`
    FOREIGN KEY
(
    `Jugador_idJugador`
)
    REFERENCES `futbol5`.`Jugador`
(
    `idJugador`
)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `fk_Equipo_Partido1`
    FOREIGN KEY
(
    `Partido_idPartido`
)
    REFERENCES `futbol5`.`Partido`
(
    `idPartido`
)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `futbol5`.`Administrador`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `futbol5`.`Administrador`;

CREATE TABLE IF NOT EXISTS `futbol5`.`Administrador`
(
    `idAdministrador`
    INT
    NOT
    NULL,
    `Persona_idPersona`
    INT
    NOT
    NULL,
    PRIMARY
    KEY
(
    `idAdministrador`
),
    INDEX `fk_Administrador_Persona1_idx`
(
    `Persona_idPersona`
    ASC
) VISIBLE,
    CONSTRAINT `fk_Administrador_Persona1`
    FOREIGN KEY
(
    `Persona_idPersona`
)
    REFERENCES `futbol5`.`Persona`
(
    `idPersona`
)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `futbol5`.`cuentaUsuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `futbol5`.`cuentaUsuario`;

CREATE TABLE IF NOT EXISTS `futbol5`.`cuentaUsuario`
(
    `idcuentaUsuario`
    INT
    NOT
    NULL,
    `usuario`
    VARCHAR
(
    45
) NULL,
    `contra` VARCHAR
(
    1000
) NULL,
    `Persona_idPersona` INT NOT NULL,
    PRIMARY KEY
(
    `idcuentaUsuario`
),
    INDEX `fk_cuentaUsuario_Persona1_idx`
(
    `Persona_idPersona`
    ASC
) VISIBLE,
    CONSTRAINT `fk_cuentaUsuario_Persona1`
    FOREIGN KEY
(
    `Persona_idPersona`
)
    REFERENCES `futbol5`.`Persona`
(
    `idPersona`
)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `futbol5`.`Permiso`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `futbol5`.`Permiso`;

CREATE TABLE IF NOT EXISTS `futbol5`.`Permiso`
(
    `idPermiso`
    INT
    NOT
    NULL,
    `descripcionPermiso`
    VARCHAR
(
    1000
) NULL,
    `cuentaUsuario_idcuentaUsuario` INT NOT NULL,
    PRIMARY KEY
(
    `idPermiso`
),
    INDEX `fk_Permiso_cuentaUsuario1_idx`
(
    `cuentaUsuario_idcuentaUsuario`
    ASC
) VISIBLE,
    CONSTRAINT `fk_Permiso_cuentaUsuario1`
    FOREIGN KEY
(
    `cuentaUsuario_idcuentaUsuario`
)
    REFERENCES `futbol5`.`cuentaUsuario`
(
    `idcuentaUsuario`
)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


SET
SQL_MODE=@OLD_SQL_MODE;
SET
FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET
UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
