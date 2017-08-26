CREATE TABLE `interview_ques`.`t_category` (
  `cat_id` INT NOT NULL,
  `cat_name` LONGTEXT NULL,
  PRIMARY KEY (`cat_id`))
COMMENT = 'table containing data for questions';

CREATE TABLE `interview_ques`.`t_catg_ques` (
  `ques_id` INT NOT NULL,
  `linked_cat_id` INT NULL,
  `ques` LONGTEXT NULL,
  PRIMARY KEY (`ques_id`));
  
  
  
CREATE TABLE `interview_ques`.`t_catg_ques_ans` (
  `ans_id` INT NOT NULL,
  `linked_ques_id` INT NULL,
  `linked_cat_id` INT NULL,
  `answer` LONGTEXT NULL,
  PRIMARY KEY (`ans_id`));


