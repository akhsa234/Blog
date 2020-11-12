begin
    execute immediate 'drop table comment';
    dbms_output.put_line('Table comment dropped');
exception
    when others then dbms_output.put_line('Table comment did not exist');
end;
/

begin
    execute immediate 'drop sequence comment_seq';
    dbms_output.put_line('Sequence comment_seq dropped');
exception
    when others then dbms_output.put_line('Sequence comment_seq did not exist');
end;
/
create table comments
(
    id           number(19)           not null,
    code         varchar2(10)         not null,
    body         nvarchar2(1000)      not null,
    name         nvarchar2(200)       not null,
    creator      nvarchar2(100)       not null,
    person_id    number(19)           not null,
    paper_id     number(19)           not null,
    current_date DATE                 not null,
    likes        number(10),
    description  nvarchar2(400),
    lock_version number(19) default 1 not null,
    constraint comment_pk_id primary key (id),
    constraint comment_un_code unique (code),
    constraint comment_fk_person_id foreign key (person_id) references PERSON (id),
    constraint comment_fk_paper_id foreign key (paper_id) references PAPER (id)


);



create sequence comment_seq
    minvalue 10000 maxvalue 9999999999999999999 cycle
    start with 10000 increment by 10 cache 1000;