import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils._text import to_native
from ansible.module_utils.six import PY3
from ansible.module_utils.urls import fetch_url
from ansible.module_utils.basic import AnsibleModule, json


class TestSourcesList(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(sources_list.module, module)
        self.assertEqual(sources_list.files, {})
        self.assertEqual(sources_list.new_repos, set())
        self.assertEqual(sources_list.default_file, '/etc/apt/sources.list')
        self.assertEqual(sources_list._apt_cfg_dir('Dir::Etc::sourceparts'), '/etc/apt/sources.list.d')

    def test_load(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        sources_list.load('/etc/apt/sources.list')
        self.assertEqual(sources_list.files, {('/etc/apt/sources.list', [('valid', True, True, 'deb http://archive.canonical.com/ubuntu hardy partner', 'Comment')])})

    def test_iter(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        sources_list.files = {('/etc/apt/sources.list', [('valid', True, True, 'deb http://archive.canonical.com/ubuntu hardy partner', 'Comment')])}
        for file, n, enabled, source, comment in sources_list:
            self.assertEqual(file, '/etc/apt/sources.list')
            self.assertEqual(n, 'valid')
            self.assertEqual(enabled, True)
            self.assertEqual(source, 'deb http://archive.canonical.com/ubuntu hardy partner')
            self.assertEqual(comment, 'Comment')

    def test_expand_path(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(sources_list._expand_path('/etc/apt/sources.list'), '/etc/apt/sources.list')
        self.assertEqual(sources_list._expand_path('sources.list'), '/etc/apt/sources.list.d/sources.list')

    def test_suggest_filename(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(sources_list._suggest_filename('deb http://archive.canonical.com/ubuntu hardy partner'), 'canonical-hardy-partner.list')

    def test_parse(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(sources_list._parse('deb http://archive.canonical.com/ubuntu hardy partner'), (True, True, 'deb http://archive.canonical.com/ubuntu hardy partner', ''))
        self.assertEqual(sources_list._parse('  deb http://archive.canonical.com/ubuntu hardy partner'), (True, True, 'deb http://archive.canonical.com/ubuntu hardy partner', ''))
        self.assertEqual(sources_list._parse('  deb http://archive.canonical.com/ubuntu hardy partner  # Comment'), (True, True, 'deb http://archive.canonical.com/ubuntu hardy partner', 'Comment'))
        self.assertEqual(sources_list._parse('  # Comment'), (False, False, '', 'Comment'))
        self.assertEqual(sources_list._parse('  deb http://archive.canonical.com/ubuntu hardy partner  # Comment'), (True, True, 'deb http://archive.canonical.com/ubuntu hardy partner', 'Comment'))

    def test_apt_cfg_file(self):
        module = AnsibleModule()
        sources_list = SourcesList(module)
        self.assertEqual(sources_list._apt_cfg_file('Dir::Etc::sourcelist'), '/etc/apt/sources.list')

if __name__ == '__main__':
    unittest.main()