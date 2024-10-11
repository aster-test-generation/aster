import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils._text import to_native
from ansible.module_utils.six import PY3
from ansible.module_utils.urls import fetch_url
from ansible_collections.ansible.builtin.plugins.module_utils.apt import SourcesLis
from ansible.module_utils.apt_repository import InvalidSource


class TestSourcesList(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(sources_list.module, module)
        self.assertEqual(sources_list.files, {})
        self.assertEqual(sources_list.new_repos, set())
        self.assertEqual(sources_list.default_file, SourcesList._apt_cfg_file('Dir::Etc::sourcelist'))
        self.assertEqual(sources_list._apt_cfg_dir('Dir::Etc::sourceparts'), 'Dir::Etc::sourceparts')

    def test_load(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        sources_list.load('test_file.list')
        self.assertIn('test_file.list', sources_list.files)

    def test_iter(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        sources_list.files = {'test_file.list': [(1, True, True, 'source', 'comment')]}
        for file, n, enabled, source, comment in sources_list:
            self.assertEqual(file, 'test_file.list')
            self.assertEqual(n, 1)
            self.assertTrue(enabled)
            self.assertEqual(source, 'source')
            self.assertEqual(comment, 'comment')

    def test_expand_path(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(sources_list._expand_path('test_file.list'), 'test_file.list')
        self.assertEqual(sources_list._expand_path('/test_file.list'), '/test_file.list')

    def test_suggest_filename(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(sources_list._suggest_filename('http://archive.canonical.com/ubuntu hardy partner'), '_canonical_hardy_partner.list')
        self.assertEqual(sources_list._suggest_filename('deb http://archive.canonical.com/ubuntu hardy partner'), '_canonical_hardy_partner.list')

    def test_parse(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(sources_list._parse('deb http://archive.canonical.com/ubuntu hardy partner'), (True, True, 'deb http://archive.canonical.com/ubuntu hardy partner', ''))
        self.assertEqual(sources_list._parse('disabled deb http://archive.canonical.com/ubuntu hardy partner'), (True, False, 'deb http://archive.canonical.com/ubuntu hardy partner', ''))
        self.assertEqual(sources_list._parse('invalid deb http://archive.canonical.com/ubuntu hardy partner'), (False, True, 'deb http://archive.canonical.com/ubuntu hardy partner', ''))

    def test_parse_invalid_source(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        with self.assertRaises(InvalidSource):
            sources_list._parse('invalid')

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