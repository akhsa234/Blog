begin
    execute immediate 'drop table tag';
    dbms_output.put_line('Table tag dropped');
exception
    when others then dbms_output.put_line('Table tag did not exist');
end;
/
begin
    execute immediate 'drop sequence tag_seq';
    dbms_output.put_line('Sequence tag_seq dropped');
exception
    when others then dbms_output.put_line('Sequence tag_seq did not exist');
end;
/
create table tag
(
    id           number(19)           not null,
    name         nvarchar2(100)       not null,
    description  nvarchar2(400),
    lock_version number(19) default 1 not null,
    constraint tag_pk_id primary key (id)

);
/
create sequence tag_seq
    minvalue 10000 maxvalue 9999999999999999999 cycle
    start with 10000 increment by 5 cache 1000;