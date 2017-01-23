 set heading off;
   set echo off;
   set feedback off;
   set termout on;
   spool D:\sql1.sql;
   Select 'alter table '||table_name||' allocate extent;' from user_tables where num_rows=0 or num_rows is null;
   spool off;