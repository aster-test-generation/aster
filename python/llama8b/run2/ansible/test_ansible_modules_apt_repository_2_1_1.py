import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils._text import to_native
from ansible.module_utils.six import PY3
from ansible.module_utils.urls import fetch_url
from ansible_collections.ansible.builtin.plugins.module_utils.apt import SourcesLis
from unittest.mock import patch, mock_open, MagicMock


class TestSourcesList(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule()
        self.sources_list = SourcesList(self.module)

    def test_init(self):
        self.assertIsInstance(self.sources_list, SourcesList)

    def test_load(self):
        with patch('builtins.open', mock_open(read_data='source1\nsource2')):
            self.sources_list.load('test.list')
            self.assertEqual(self.sources_list.files['test.list'], [('0', True, True, 'source1', ''), ('1', True, True, 'source2', '')])

    def test_save(self):
        with patch('builtins.open', mock_open()) as m:
            self.sources_list.save()
            m.assert_called_once_with('test.list', 'w')

    def test_dump(self):
        self.sources_list.files = {'test.list': [('0', True, True, 'source1', ''), ('1', True, True, 'source2', '')]}
        self.assertEqual(self.sources_list.dump(), {'test.list': 'source1\nsource2'})

    def test_choice(self):
        self.assertEqual(self.sources_list._choice('new', 'old'), 'new')

    def test_choice_none(self):
        self.assertEqual(self.sources_list._choice(None, 'old'), 'old')

    def test_apt_cfg_dir(self):
        with patch('apt_pkg.config.find_dir') as m:
            self.sources_list._apt_cfg_dir('Dir::Etc::sourcelist')
            m.assert_called_once_with('Dir::Etc::sourcelist')

    def test_load_default_file(self):
        with patch('builtins.open', mock_open(read_data='source1\nsource2')):
            self.sources_list.load(self.sources_list.default_file)
            self.assertEqual(self.sources_list.files[self.sources_list.default_file], [('0', True, True, 'source1', ''), ('1', True, True, 'source2', '')])

    def test_load_file(self):
        with patch('builtins.open', mock_open(read_data='source1\nsource2')):
            self.sources_list.load('test.list')
            self.assertEqual(self.sources_list.files['test.list'], [('0', True, True, 'source1', ''), ('1', True, True, 'source2', '')])

    def test_save_file(self):
        with patch('builtins.open', mock_open()) as m:
            self.sources_list.save()
            m.assert_called_once_with('test.list', 'w')

    def test_dump_file(self):
        self.sources_list.files = {'test.list': [('0', True, True, 'source1', ''), ('1', True, True, 'source2', '')]}
        self.assertEqual(self.sources_list.dump(), {'test.list': 'source1\nsource2'})

    def test_choice_new(self):
        self.assertEqual(self.sources_list._choice('new', 'old'), 'new')

    def test_choice_old(self):
        self.assertEqual(self.sources_list._choice('old', 'old'), 'old')

    def test_choice_none(self):
        self.assertEqual(self.sources_list._choice(None, 'old'), 'old')

    def test_apt_cfg_dir(self):
        with patch('apt_pkg.config.find_dir') as m:
            self.sources_list._apt_cfg_dir('Dir::Etc::sourcelist')
            m.assert_called_once_with('Dir::Etc::sourcelist')

    def test_load_default_file(self):
        with patch('builtins.open', mock_open(read_data='source1\nsource2')):
            self.sources_list.load(self.sources_list.default_file)
            self.assertEqual(self.sources_list.files[self.sources_list.default_file], [('0', True, True, 'source1', ''), ('1', True, True, 'source2', '')])

    def test_load_file(self):
        with patch('builtins.open', mock_open(read_data='source1\nsource2')):
            self.sources_list.load('test.list')
            self.assertEqual(self.sources_list.files['test.list'], [('0', True, True, 'source1', ''), ('1', True, True, 'source2', '')])

    def test_save_file(self):
        with patch('builtins.open', mock_open()) as m:
            self.sources_list.save()
            m.assert_called_once_with('test.list', 'w')

if __name__ == '__main__':
    unittest.main()