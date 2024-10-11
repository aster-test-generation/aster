import unittest
from ansible.module_utils.basic import AnsibleModul


class TestVarsModule(unittest.TestCase):
    def test_get_vars(self):
        instance = VarsModule()
        result = instance.get_vars(None, None, None)
        self.assertEqual(result, {})

    def test_get_vars_host(self):
        instance = VarsModule()
        entity = Host('host1')
        result = instance.get_vars(None, None, entity)
        self.assertEqual(result, {})

    def test_get_vars_group(self):
        instance = VarsModule()
        entity = Group('group1')
        result = instance.get_vars(None, None, entity)
        self.assertEqual(result, {})

    def test_get_vars_host_vars(self):
        instance = VarsModule()
        entity = Host('host1')
        subdir = 'host_vars'
        b_opath = os.path.realpath(to_bytes(os.path.join(instance._basedir, subdir)))
        opath = to_text(b_opath)
        key = '%s.%s' % (entity.name, opath)
        found_files = [os.path.join(opath, 'file1.yml'), os.path.join(opath, 'file2.json')]
        FOUND[key] = found_files
        result = instance.get_vars(None, None, entity)
        self.assertEqual(result, {})

    def test_get_vars_group_vars(self):
        instance = VarsModule()
        entity = Group('group1')
        subdir = 'group_vars'
        b_opath = os.path.realpath(to_bytes(os.path.join(instance._basedir, subdir)))
        opath = to_text(b_opath)
        key = '%s.%s' % (entity.name, opath)
        found_files = [os.path.join(opath, 'file1.yml'), os.path.join(opath, 'file2.json')]
        FOUND[key] = found_files
        result = instance.get_vars(None, None, entity)
        self.assertEqual(result, {})

    def test_get_vars_invalid_entity(self):
        instance = VarsModule()
        entity = 'invalid'
        with self.assertRaises(AnsibleParserError):
            instance.get_vars(None, None, entity)

    def test_get_vars_no_basedir(self):
        instance = VarsModule()
        instance._basedir = None
        with self.assertRaises(AnsibleParserError):
            instance.get_vars(None, None, Host('host1'))

    def test_get_vars_no_subdir(self):
        instance = VarsModule()
        instance._basedir = os.path.join(os.getcwd(), 'test')
        entity = Host('host1')
        with self.assertRaises(AnsibleParserError):
            instance.get_vars(None, None, entity)

    def test_get_vars_no_files(self):
        instance = VarsModule()
        entity = Host('host1')
        subdir = 'host_vars'
        b_opath = os.path.realpath(to_bytes(os.path.join(instance._basedir, subdir)))
        opath = to_text(b_opath)
        key = '%s.%s' % (entity.name, opath)
        found_files = []
        FOUND[key] = found_files
        result = instance.get_vars(None, None, entity)
        self.assertEqual(result, {})

    def test_get_vars_cache(self):
        instance = VarsModule()
        entity = Host('host1')
        subdir = 'host_vars'
        b_opath = os.path.realpath(to_bytes(os.path.join(instance._basedir, subdir)))
        opath = to_text(b_opath)
        key = '%s.%s' % (entity.name, opath)
        found_files = [os.path.join(opath, 'file1.yml'), os.path.join(opath, 'file2.json')]
        FOUND[key] = found_files
        result = instance.get_vars(None, None, entity)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()