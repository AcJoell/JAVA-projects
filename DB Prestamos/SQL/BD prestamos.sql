CREATE DATABASE prestamos;
use prestamos;
CREATE TABLE tbestudiante (
  estuId varchar(25) NOT NULL,
  estuNom varchar(50) NOT NULL,
  estuApe varchar(50) NOT NULL,
  estuDir varchar(50) DEFAULT NULL,
  PRIMARY KEY (estuId)
);

insert into tbestudiante values
('CC12457895','Juan Esteban','Mora','Calle 3 # 2-32 piso 3'),
('CC555555','Pedro','Perez','Carrera 5 # 2-32'),
('CC999999','Leonardo','Rojas','Calle 8 # 9-10'),
('RC1222254478','Matias','Segura','Diagonal 5 # 2-33'),
('TI123456789','Luisa Fernanda','Giraldo',null);

create table tblibro (
  libId varchar(30) not null,
  libTtl varchar(50) not null,
  libEdit varchar(50) default 'Planeta',
  ibAutor varchar(30) not null,
  libPags int default null,
  libFoto blob,
  PRIMARY KEY (libId)
);

insert into tblibro values
('sbn4545421','Cien años de Soledad','Planeta','Gabriel Garcia',null,null),
('sbn488888421','Cien años de Soledad','Planeta','Gabriel Garcia',null,null),
('sbn5555550','Cuentos de Terror','Planeta','Alvaro Uribe',null,null),
('sbn989989','Trigonometria 2','Planeta','Pepito Perez',null,null);

create table tbprestamo (
  prestId int not null auto_increment,
  prestEstu varchar(25) not null,
  prestLib varchar(30) not null,
  prestFech date not null,
  primary key (prestId),
  KEY prestEstu (prestEstu),
  KEY prestLib (prestLib),
  constraint prestLib FOREIGN KEY (prestLib) REFERENCES tblibro (libId),
  constraint prestEstu FOREIGN KEY (prestEstu) REFERENCES tbestudiante(estuId)
);

insert into tbprestamo value(1,'CC12457895','sbn5555550','2020-10-31');

use prestamos;
select * from tbestudiante;
select * from tblibro;
select * from tbprestamo;