begin
    execute immediate 'drop table person';
    dbms_output.put_line('Table person dropped');
exception
    when others then dbms_output.put_line('Table person did not exist');
end;
/

begin
    execute immediate 'drop sequence person_seq';
    dbms_output.put_line('Sequence person_seq dropped');
exception
    when others then dbms_output.put_line('Sequence person_seq did not exist');
end;
/
create table person
(
    id           number(19)           not null,
    nationalcode number(10)           not null,
    first_name   nvarchar2(200)       not null,
    last_name    nvarchar2(200)       not null,
    email        varchar2(70)         not null,
    country      nvarchar2(20)        not null,
    gender       nvarchar2(20)        not null,
    phone        number(15)           not null,
    description  nvarchar2(400),
    lock_version number(19) default 1 not null,
    constraint person_pk_id primary key (id),
    constraint person_un_code unique (nationalcode),
    constraint person_un_email unique (email)
);
/
create sequence person_seq
    minvalue 10000 maxvalue 9999999999999999999 cycle
    start with 10000 increment by 5 cache 1000;