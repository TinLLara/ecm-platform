  -- 菜单SQL
  INSERT INTO `sys_menu` (`parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
      VALUES ('1', '请休假信息表', 'oa/oaholidayapply', NULL, '1', 'config', '6');

  -- 按钮父菜单ID
  set @parentId = @@identity;

  -- 菜单对应按钮SQL
  INSERT INTO `sys_menu` (`parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
      SELECT @parentId, '查看', null, 'oa:oaholidayapply:list,oa:oaholidayapply:info', '2', null, '6';
  INSERT INTO `sys_menu` (`parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
      SELECT @parentId, '新增', null, 'oa:oaholidayapply:save', '2', null, '6';
  INSERT INTO `sys_menu` (`parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
      SELECT @parentId, '修改', null, 'oa:oaholidayapply:update', '2', null, '6';
  INSERT INTO `sys_menu` (`parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`)
      SELECT @parentId, '删除', null, 'oa:oaholidayapply:delete', '2', null, '6';
