begin
    execute immediate 'drop table paper';
    dbms_output.put_line('Table paper dropped');
exception
    when others then dbms_output.put_line('Table paper did not exist');
end;
/
begin
    execute immediate 'drop sequence paper_seq';
    dbms_output.put_line('Sequence paper_seq dropped');
exception
    when others then dbms_output.put_line('Sequence paper_seq did not exist');
end;
/
create table paper
(
    id           number(19)           not null,
    body         NCLOB                not null,
    title        nvarchar2(100)       not null,
    current_date DATE                 not null,
    release_date DATE                 not null,
    modify_date  DATE                 not null,
    tags         varchar2(100)        not null,
    likes        number(10) default 0,
    rate         number(10) default 0,
    description  nvarchar2(400),
    lock_version number(19) default 1 not null,
    constraint paper_pk_id primary key (id)

);
/
create sequence paper_seq
    minvalue 10000 maxvalue 99999999999999999 cycle
    start with 10000 increment by 10 cache 1000;