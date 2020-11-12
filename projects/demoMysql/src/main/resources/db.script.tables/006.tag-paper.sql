begin
    execute immediate 'drop table tagpaper';
    dbms_output.put_line('Table tag-paper dropped');
exception
    when others then dbms_output.put_line('Table tag-paper did not exist');
end;
/
begin
    execute immediate 'drop sequence tagpaper_seq';
    dbms_output.put_line('Sequence tag-paper_seq dropped');
exception
    when others then dbms_output.put_line('Sequence tag-paper_seq did not exist');
end;
/
create table tagpaper
(
    id           number(19)           not null,
    tag_id   number(19)          not null,
    papar_id   number(19)        not null,
    constraint tagpaper_pk_id primary key (id),
    constraint paper_fk_tag_id foreign key (tag_id) references tag(id) ,
    constraint tag_fk_papar_id foreign key (papar_id) references paper(id)

);
/
create sequence tagpaper_seq
    minvalue 10000 maxvalue 9999999999999999999 cycle
    start with 10000 increment by 5 cache 1000;