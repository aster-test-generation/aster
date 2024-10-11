import unittest
from ansible.modules.apt_repository import SourcesList, DEFAULT_SOURCES_PERM, VALID_SOURCE_TYPES


class TestSourcesList(unittest.TestCase):
    def test___init__(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        self.assertIsInstance(sources_list, SourcesList)

    def test___iter__(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        iter_result = iter(sources_list)
        self.assertIsInstance(iter_result, iterator)

    def test__expand_path(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        result = sources_list._expand_path('filename')
        self.assertIsInstance(result, str)

    def test__suggest_filename(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        result = sources_list._suggest_filename('deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertIsInstance(result, str)

    def test__parse(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        result = sources_list._parse('deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertIsInstance(result, tuple)

    def test_load(self):
        from ansible.module_utils.basic import AnsibleModule
        sources_list = SourcesList(module)
        sources_list.load('filename')
        self.assertIsInstance(sources_list.files, dict)

class TestDEFAULT_SOURCES_PERM(unittest.TestCase):
    def test_DEFAULT_SOURCES_PERM(self):
        self.assertEqual(DEFAULT_SOURCES_PERM, 420)

class TestVALID_SOURCE_TYPES(unittest.TestCase):
    def test_VALID_SOURCE_TYPES(self):
        self.assertEqual(VALID_SOURCE_TYPES, ('deb', 'deb-src'))

if __name__ == '__main__':
    unittest.main()