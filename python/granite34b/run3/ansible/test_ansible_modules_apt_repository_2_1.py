import unittest
from ansible.modules.apt_repository import SourcesList


class TestSourcesList(unittest.TestCase):
    def test_init(self):
        module = None  # Replace with the actual module object
        sources_list = SourcesList(module)
        self.assertEqual(sources_list.files, {})
        self.assertEqual(sources_list.new_repos, set())
        self.assertEqual(sources_list.default_file, '/etc/apt/sources.list')

    def test_modify(self):
        module = None  # Replace with the actual module object
        from ansible.module_utils.basic import AnsibleModule
        file = '/etc/apt/sources.list'
        n = 0
        enabled = True
        source = 'deb http://archive.canonical.com/ubuntu hardy partner'
        comment = 'Added by Ansible'
        sources_list.modify(file, n, enabled=enabled, source=source, comment=comment)
        self.assertEqual(sources_list.files[file][n], (n, True, True, 'deb http://archive.canonical.com/ubuntu hardy partner', 'Added by Ansible'))

    def test_add_valid_source(self):
        module = None  # Replace with the actual module object
        sources_list = SourcesList(module)
        source_new = 'deb http://archive.canonical.com/ubuntu hardy partner'
        comment_new = 'Added by Ansible'
        file = '/etc/apt/sources.list'
        sources_list._add_valid_source(source_new, comment_new, file=file)
        self.assertEqual(sources_list.files[file][0], (0, True, True, 'deb http://archive.canonical.com/ubuntu hardy partner', 'Added by Ansible'))

    def test_remove_valid_source(self):
        module = None  # Replace with the actual module object
        sources_list = SourcesList(module)
        source = 'deb http://archive.canonical.com/ubuntu hardy partner'
        sources_list._remove_valid_source(source)
        self.assertEqual(sources_list.files, {})

if __name__ == '__main__':
    unittest.main()