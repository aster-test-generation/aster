import unittest
from ansible.playbook.play import Play


class TestPlay(unittest.TestCase):
    def test_validate_hosts(self):
        play = Play()
        play._ds = {'hosts': ['host1', 'host2']}
        play._validate_hosts('hosts', 'hosts', play._ds['hosts'])
        play._ds = {'hosts': ''}
        with self.assertRaises(AnsibleParserError):
            play._validate_hosts('hosts', 'hosts', play._ds['hosts'])
        play._ds = {'hosts': None}
        with self.assertRaises(AnsibleParserError):
            play._validate_hosts('hosts', 'hosts', play._ds['hosts'])

    def test_get_name(self):
        play = Play()
        play.name = None
        play.hosts = ['host1', 'host2']
        self.assertEqual(play.get_name(), 'host1,host2')
        play.hosts = 'host3'
        self.assertEqual(play.get_name(), 'host1,host2')

    def test_load(self):
        play = Play.load({'name': 'Play 1'}, loader=None, variable_manager=None)
        self.assertEqual(play.hosts, 'host1')
        self.assertEqual(play.name, 'Play 1')

    def test_preprocess_data(self):
        play = Play()
        play._ds = {'user': 'user1', 'name': 'Play 1'}
        play.preprocess_data(play._ds)
        self.assertEqual(play._ds['remote_user'], 'user1')
        self.assertEqual(play._ds['name'], 'Play 1')

    def test_load_tasks(self):
        play = Play()
        play._ds = {'tasks': [{'task1': 'value1'}, {'task2': 'value2'}]}
        play._variable_manager = None
        play._loader = None
        tasks = play._load_tasks('tasks', play._ds['tasks'], variable_manager=variable_manager)
        self.assertEqual(len(tasks), 2)
        self.assertEqual(tasks[0].task1, 'value1')
        self.assertEqual(tasks[1].task2, 'value2')

    def test_load_pre_tasks(self):
        play = Play()
        play._ds = {'pre_tasks': [{'task1': 'value1'}, {'task2': 'value2'}]}
        play._variable_manager = None
        play._loader = None
        pre_tasks = play._load_pre_tasks('pre_tasks', play._ds.get('pre_tasks', []))
        self.assertEqual(len(pre_tasks), 2)
        self.assertEqual(pre_tasks[0].task1, 'value1')
        self.assertEqual(pre_tasks[1].task2, 'value2')

    def test_load_post_tasks(self):
        play = Play()
        play._ds = {'post_tasks': [{'task1': 'value1'}, {'task2': 'value2'}]}
        play._variable_manager = None
        play._loader = None
        post_tasks = play._load_post_tasks('post_tasks', play._ds['post_tasks'])
        self.assertEqual(len(post_tasks), 2)
        self.assertEqual(post_tasks[0].task1, 'value1')
        self.assertEqual(post_tasks[1].task2, 'value2')

    def test_load_handlers(self):
        play = Play()
        play._ds = {'handlers': [{'handler1': 'value1'}, {'handler2': 'value2'}]}
        play._variable_manager = None
        play._loader = None
        handlers = play._load_handlers(self.play._ds['handlers'])
        self.assertEqual(len(handlers), 2)
        self.assertEqual(handlers[0].handler1, 'value1')
        self.assertEqual(handlers[1].handler2, 'value2')

    def test_load_roles(self):
        play = Play()
        play._ds = {'roles': [{'role1': 'value1'}, {'role2': 'value2'}]}
        play._variable_manager = None
        play._loader = None
        play._load_roles('roles', play._ds['roles'], play._variable_manager)
        self.assertEqual(len(play.roles), 2)
        self.assertEqual(play.roles[0].role1, 'value1')
        self.assertEqual(play.roles[1].role2, 'value2')

if __name__ == '__main__':
    unittest.main()