select * from public.app_user inner join user_role ur on app_user.role_id = ur.role_id where ur.name='BASIC_USER'
