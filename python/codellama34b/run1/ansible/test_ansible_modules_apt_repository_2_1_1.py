import unittest
from ansible.modules.apt_repository import *



class TestAptRepository(unittest.TestCase):
    def test_apt_repository(self):
        from apt_repo import AptRepository
        result = instance.apt_repository()
        self.assertEqual(result, None)

    def test_main(self):
        instance = apt.AptRepository()
        result = instance.main()
        self.assertEqual(result, None)

    def test_apt_pkg(self):
        from apt_repo import AptRepository
        result = instance.apt_pkg()
        self.assertEqual(result, None)

    def test_aptsources_distro(self):
        from apt_repository import AptRepository
        result = instance.aptsources_distro()
        self.assertEqual(result, None)

    def test_distro(self):
        instance = apt_repository.AptRepository()
        result = instance.distro()
        self.assertEqual(result, None)

    def test_apt(self):
        from apt_repository import AptRepository
        result = instance.apt()
        self.assertEqual(result, None)

    def test_apt_supports_pinning(self):
        from apt_repository import AptRepository
        result = instance.apt_supports_pinning()
        self.assertEqual(result, None)

    def test_apt_cache(self):
        from apt_repository import AptRepository
        result = instance.apt_cache()
        self.assertEqual(result, None)

    def test_apt_cache_gen(self):
        from apt_repository import AptRepository
        result = instance.apt_cache_gen()
        self.assertEqual(result, None)

    def test_apt_cache_dump(self):
        from apt_repo import AptRepository
        result = instance.apt_cache_dump()
        self.assertEqual(result, None)

    def test_apt_cache_dump_contents(self):
        from apt_repo import AptRepository
        result = instance.apt_cache_dump_contents()
        self.assertEqual(result, None)

    def test_apt_cache_dump_header(self):
        from apt_repository import AptRepository
        result = instance.apt_cache_dump_header()
        self.assertEqual(result, None)

    def test_apt_cache_dump_records(self):
        from apt_repository import AptRepository
        result = instance.apt_cache_dump_records()
        self.assertEqual(result, None)

    def test_apt_cache_dump_pkgcache(self):
        from apt_repo import AptRepository
        result = instance.apt_cache_dump_pkgcache()
        self.assertEqual(result, None)

    def test_apt_cache_dump_srcpkgcache(self):
        from apt_repo import AptRepository
        result = instance.apt_cache_dump_srcpkgcache()
        self.assertEqual(result, None)

    def test_apt_cache_open(self):
        from apt_repo import AptRepository
        result = instance.apt_cache_open()
        self.assertEqual(result, None)

    def test_apt_cache_open_progress(self):
        from apt_repository import AptRepository
        result = instance.apt_cache_open_progress()
        self.assertEqual(result, None)

    def test_apt_cache_close(self):
        from apt_repo import AptRepository
        result = instance.apt_cache_close()
        self.assertEqual(result, None)

    def test_apt_cache_clean(self):
        from apt_repository import AptRepository
        result = instance.apt_cache_clean()
        self.assertEqual(result, None)

    def test_apt_cache_depends(self):
        from apt_repo import AptRepository
        result = instance.apt_cache_depends()
        self.assertEqual(result, None)

    def test_apt_cache_rdepends(self):
        from apt_repository import AptRepository
        result = instance.apt_cache_rdepends()
        self.assertEqual(result, None)


class TestSourcesList(unittest.TestCase):
    def test_init(self):
        instance = SourcesList(None)
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_apt_cfg_dir(self):
        instance = SourcesList(None)
        result = instance._apt_cfg_dir('Dir::Etc::sourcelist')
        self.assertEqual(result, None)

    def test_load(self):
        instance = SourcesList(None)
        instance.load('')
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_save(self):
        instance = SourcesList(None)
        instance.save()
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_dump(self):
        instance = SourcesList(None)
        result = instance.dump()
        self.assertEqual(result, {})
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_choice(self):
        instance = SourcesList(None)
        result = instance._choice(None, None)
        self.assertEqual(result, None)
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

if __name__ == '__main__':
    unittest.main()