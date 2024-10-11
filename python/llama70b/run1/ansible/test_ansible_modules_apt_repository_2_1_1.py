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
        dump = sl.dump()
        self.assertIsInstance(dump, dict)

    def test__choice(self):
        from ansible.module_utils.basic import AnsibleModule
        new = 'new'
        old = 'old'
        result = sl._choice(new, old)
        self.assertEqual(result, new)

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        result = str(sl)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        result = repr(sl)
        self.assertIsInstance(result, str)

class TestAnsibleModule(unittest.TestCase):
    def test___init__(self):
        from ansible.module_utils.basic import AnsibleModule
        self.assertIsInstance(module, AnsibleModule)

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        result = str(module)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        result = repr(module)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()