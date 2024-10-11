import unittest
from ansible.modules.apt_repository import SourcesList, DEFAULT_SOURCES_PERM, VALID_SOURCE_TYPES


class TestSourcesList(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        sl = SourcesList(module)
        self.assertIsInstance(sl, SourcesList)

    def test__apt_cfg_dir(self):
        from ansible.module_utils.basic import AnsibleModule
        result = sl._apt_cfg_dir('Dir::Etc::sourcelist')
        self.assertIsInstance(result, str)

    def test_load(self):
        from ansible.module_utils.basic import AnsibleModule
        file = 'test.list'
        with open(file, 'w') as f:
            f.write('deb http://example.com/ubuntu stable main\n')
        sl.load(file)
        self.assertIn(file, sl.files)

    def test_save(self):
        from ansible.module_utils.basic import AnsibleModule
        file = 'test.list'
        with open(file, 'w') as f:
            f.write('deb http://example.com/ubuntu stable main\n')
        sl.load(file)
        sl.save()
        self.assertTrue(os.path.exists(file))

    def test_dump(self):
        from ansible.module_utils.basic import AnsibleModule
        file = 'test.list'
        with open(file, 'w') as f:
            f.write('deb http://example.com/ubuntu stable main\n')
        sl.load(file)
        dumpstruct = sl.dump()
        self.assertIsInstance(dumpstruct, dict)

    def test__choice(self):
        from ansible.module_utils.basic import AnsibleModule
        new = 'new'
        old = 'old'
        result = sl._choice(new, old)
        self.assertEqual(result, new)

    def test__private_method(self):
        from ansible.module_utils.basic import AnsibleModule
        result = sl._SourcesList__parse('deb http://example.com/ubuntu stable main\n')
        self.assertIsInstance(result, tuple)

    def test__str__(self):
        from ansible.module_utils.basic import AnsibleModule
        result = str(sl)
        self.assertIsInstance(result, str)

    def test__repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        result = repr(sl)
        self.assertIsInstance(result, str)

class TestDEFAULT_SOURCES_PERM(unittest.TestCase):
    def test_DEFAULT_SOURCES_PERM(self):
        self.assertEqual(DEFAULT_SOURCES_PERM, 420)

class TestVALID_SOURCE_TYPES(unittest.TestCase):
    def test_VALID_SOURCE_TYPES(self):
        self.assertEqual(VALID_SOURCE_TYPES, ('deb', 'deb-src'))

if __name__ == '__main__':
    unittest.main()