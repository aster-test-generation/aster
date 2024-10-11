import unittest
from ansible.playbook.play import Play


class TestPlay(unittest.TestCase):
    def test_init(self):
        play = Play()
        self.assertEqual(play._included_conditional, None)
        self.assertEqual(play._included_path, None)
        self.assertEqual(play._removed_hosts, [])
        self.assertEqual(play.ROLE_CACHE, {})
        self.assertEqual(play.only_tags, {'all'})
        self.assertEqual(play.skip_tags, set())
        self.assertEqual(play._action_groups, {})
        self.assertEqual(play._group_actions, {})

    def test_compile(self):
        play = Play()
        flush_block = play.Block.load(data={'meta': 'flush_handlers'}, play=play, variable_manager=play._variable_manager, loader=play._loader)
        for task in flush_block.block:
            task.implicit = True
        block_list = []
        block_list.extend(play.pre_tasks)
        block_list.append(flush_block)
        block_list.extend(play._compile_roles())
        block_list.extend(play.tasks)
        block_list.append(flush_block)
        block_list.extend(play.post_tasks)
        block_list.append(flush_block)
        self.assertEqual(play.compile(), block_list)

    def test_get_vars(self):
        play = Play()
        self.assertEqual(play.get_vars(), play.vars.copy())

    def test_get_vars_files(self):
        play = Play()
        if play.get_vars_files() is None:
            self.assertEqual(play.get_vars_files(), [])
        elif not isinstance(play.vars_files, list):
            self.assertEqual(play.get_vars_files(), [play.vars_files])
        else:
            self.assertEqual(play.get_vars_files(), play.vars_files)

    def test_get_handlers(self):
        play = Play()
        self.assertEqual(play.get_handlers(), play.handlers)

    def test_get_roles(self):
        play = Play()
        self.assertEqual(play.get_roles(), list(play.roles))

    def test_get_tasks(self):
        play = Play()
        tasklist = []
        for task in play.get_tasks() + play.tasks + play.post_tasks:
            if isinstance(task, play.Block):
                tasklist.append(task.block + task.rescue + task.always)
            else:
                tasklist.append(task)
        self.assertEqual(play.get_tasks(), tasklist)

    def test_serialize(self):
        play = Play()
        data = play.to_dict()
        roles = []
        for role in play.get_roles():
            roles.append(role.serialize())
        data['roles'] = roles
        data['included_path'] = play._included_path
        data['action_groups'] = play._action_groups
        data['group_actions'] = play._group_actions
        self.assertEqual(data, play.serialize())

    def test_deserialize(self):
        play = Play()
        data = play.to_data()
        play.deserialize(data)
        self.assertEqual(play._included_path, data.get('included_path', None))
        self.assertEqual(play._action_groups, data.get('action_groups', {}))
        self.assertEqual(play._group_actions, data.get('group_actions', {}))
        if 'roles' in data:
            role_data = data.get('roles', [])
            roles = []
            for role in role_data:
                r = Role()
                r.deserialize(role)
                roles.append(r)
            setattr(play, 'roles', roles)
            del data['roles']
        self.assertEqual(play.deserialize(data), None)

    def test_copy(self):
        play = Play()
        new_play = play.copy()
        self.assertEqual(new_play.ROLE_CACHE, play.ROLE_CACHE.copy())
        self.assertEqual(new_play._included_conditional, play._included_conditional)
        self.assertEqual(new_play._included_path, play._included_path)
        self.assertEqual(new_play._action_groups, play._action_groups)
        self.assertEqual(new_play._group_actions, play._group_actions)

if __name__ == '__main__':
    unittest.main()