-- MySQL Script generated by MySQL Workbench
-- Thu Jul 31 06:41:18 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema school
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `school` ;

-- -----------------------------------------------------
-- Schema school
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `school` DEFAULT CHARACTER SET utf8 ;
USE `school` ;

-- -----------------------------------------------------
-- Table `school`.`student`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `school`.`student` ;

CREATE TABLE IF NOT EXISTS `school`.`student` (
  `student_id` INT NOT NULL,
  `student_name` VARCHAR(45) NOT NULL,
  `student_gpa` FLOAT NOT NULL,
  PRIMARY KEY (`student_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `school`.`subject`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `school`.`subject` ;

CREATE TABLE IF NOT EXISTS `school`.`subject` (
  `subject_id` INT NOT NULL,
  `subject_name` VARCHAR(45) NOT NULL,
  `subject_credit` FLOAT NOT NULL,
  PRIMARY KEY (`subject_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `school`.`teacher`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `school`.`teacher` ;

CREATE TABLE IF NOT EXISTS `school`.`teacher` (
  `teacher_id` INT NOT NULL,
  `teacher_name` VARCHAR(45) NOT NULL,
  `teacher_position` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`teacher_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `school`.`learn`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `school`.`learn` ;

CREATE TABLE IF NOT EXISTS `school`.`learn` (
  `subject_id` INT NOT NULL,
  `student_id` INT NOT NULL,
  `term` INT(2) NOT NULL,
  `year` INT NOT NULL,
  `result` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`subject_id`, `student_id`),
  INDEX `fk_subject_has_student_student1_idx` (`student_id` ASC),
  INDEX `fk_subject_has_student_subject_idx` (`subject_id` ASC),
  CONSTRAINT `fk_subject_has_student_subject`
    FOREIGN KEY (`subject_id`)
    REFERENCES `school`.`subject` (`subject_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_subject_has_student_student1`
    FOREIGN KEY (`student_id`)
    REFERENCES `school`.`student` (`student_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `school`.`teach`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `school`.`teach` ;

CREATE TABLE IF NOT EXISTS `school`.`teach` (
  `teacher_id` INT NOT NULL,
  `student_id` INT NOT NULL,
  `term` INT(2) NOT NULL,
  `year` INT NOT NULL,
  PRIMARY KEY (`teacher_id`, `student_id`),
  INDEX `fk_teacher_has_student_student1_idx` (`student_id` ASC),
  INDEX `fk_teacher_has_student_teacher1_idx` (`teacher_id` ASC),
  CONSTRAINT `fk_teacher_has_student_teacher1`
    FOREIGN KEY (`teacher_id`)
    REFERENCES `school`.`teacher` (`teacher_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_teacher_has_student_student1`
    FOREIGN KEY (`student_id`)
    REFERENCES `school`.`student` (`student_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
