import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_native
from ansible.module_utils.six import PY3
from ansible.module_utils.urls import fetch_url
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils._text import to_byte
from ansible.module_utils import apt
from ansible.module_utils.apt_repository import SourcesList, DEFAULT_SOURCES_PERM, VALID_SOURCE_TYPES


class TestSourcesList(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(sources_list.module, module)
        self.assertEqual(sources_list.files, {})
        self.assertEqual(sources_list.new_repos, set())
        self.assertEqual(sources_list.default_file, DEFAULT_SOURCES_PERM)
        self.assertEqual(sources_list._apt_cfg_dir('Dir::Etc::sourceparts'), 'Dir::Etc::sourceparts')

    def test_load(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        sources_list.load('test_file.list')
        self.assertIn('test_file.list', sources_list.files)

    def test_modify(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        sources_list.files = {'test_file.list': [(1, True, True, 'deb', 'comment')]}
        sources_list.modify('test_file.list', 1, enabled=True, source='deb', comment='new_comment')
        self.assertEqual(sources_list.files['test_file.list'][0][2], True)
        self.assertEqual(sources_list.files['test_file.list'][0][4], 'new_comment')

    def test_add_source(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        sources_list.add_source('deb http://archive.canonical.com/ubuntu hardy partner', comment='comment')
        self.assertIn('deb http://archive.canonical.com/ubuntu hardy partner', sources_list.new_repos)

    def test_remove_source(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        sources_list.files = {'test_file.list': [(1, True, True, 'deb', 'comment')]}
        sources_list.remove_source('deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertNotIn('deb http://archive.canonical.com/ubuntu hardy partner', sources_list.new_repos)

    def test_suggest_filename(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(sources_list._suggest_filename('deb http://archive.canonical.com/ubuntu hardy partner'), 'test.list')

    def test_parse(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(sources_list._parse('deb http://archive.canonical.com/ubuntu hardy partner', raise_if_invalid_or_disabled=True), ('deb', 'http://archive.canonical.com/ubuntu', 'hardy', 'partner'))

    def test_str(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(str(sources_list), 'SourcesList')

    def test_repr(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(repr(sources_list), 'SourcesList(module=AnsibleModule())')

    def test_eq(self):
        module = AnsibleModule()
        sources_list1 = SourcesList(module)
        sources_list2 = SourcesList(module)
        self.assertEqual(sources_list1, sources_list2)

if __name__ == '__main__':
    unittest.main()